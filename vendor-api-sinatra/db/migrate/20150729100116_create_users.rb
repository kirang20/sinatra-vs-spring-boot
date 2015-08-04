class CreateUsers < ActiveRecord::Migration
  def change
    create_table :users do |t|
      t.string :name, null: false, limit: 255
      t.string :phone_number, limit: 255
      t.string :type, null: false
      t.timestamps
    end
  end
end
