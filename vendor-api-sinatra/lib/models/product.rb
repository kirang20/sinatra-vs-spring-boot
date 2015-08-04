class Product < ActiveRecord::Base
  validates_presence_of :sku, :name, :price, :currency, :vendor
  belongs_to :vendor
end
