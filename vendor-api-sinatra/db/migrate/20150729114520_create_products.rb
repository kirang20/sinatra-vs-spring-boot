class CreateProducts < ActiveRecord::Migration
  def change
    create_table :products do |t|
      t.string :sku, null: false, limit: 255
      t.string :name, limit: 255
      t.decimal :price
      t.string :currency, limit: 255
      t.integer :vendor_id, null: false
      t.timestamps
    end
  end
end
