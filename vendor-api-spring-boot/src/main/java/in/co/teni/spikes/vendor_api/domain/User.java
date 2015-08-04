package in.co.teni.spikes.vendor_api.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

@Entity(name = "users")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type", discriminatorType = DiscriminatorType.STRING)
public class User {
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue
  @JsonProperty
  private Integer id;

  @Column(nullable = false)
  @JsonProperty
  private String name;

  @Column(nullable = false, name = "phone_number")
  @JsonProperty
  private String phoneNumber;

  @Column(nullable = false, insertable = false, updatable = false)
  @JsonProperty
  private String type;

  @Column(nullable = false, name = "created_at")
  private Timestamp createdAt;

  @Column(nullable = false, name = "updated_at")
  private Timestamp updatedAt;

  protected User() {
  }

  @PrePersist
  private void onCreate() {
    createdAt = new Timestamp((new Date()).getTime());
    updatedAt = createdAt;
  }

  @PreUpdate
  private void onUpdate() {
    updatedAt = new Timestamp((new Date()).getTime());
  }

  public String name() {
    return name;
  }

  public String phoneNumber() {
    return phoneNumber;
  }

  @Override
  public String toString() {
    return "User{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", phoneNumber='" + phoneNumber + '\'' +
        ", type='" + type + '\'' +
        ", createdAt=" + createdAt +
        ", updatedAt=" + updatedAt +
        '}';
  }
}
