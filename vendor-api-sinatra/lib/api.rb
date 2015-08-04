require 'json'
require 'pry'
require_relative 'models/user'
require_relative 'models/vendor'
require_relative 'models/product'

get '/vendor' do
  Vendor.all.to_json
end

post '/vendor' do
  request.body.rewind
  params = JSON.parse request.body.read
  vendor = Vendor.create(params['vendor'])
  unless vendor.errors.empty?
    body vendor.errors.messages
    error 400 do
    end
  end
  "Successfully created Vendor: #{vendor.name}"
end

get '/vendor/:id/catalog' do
  Product.where(vendor: Vendor.find(params['id'])).to_json
end

post '/vendor/:id/catalog' do
  request.body.rewind
  params = JSON.parse request.body.read
  products = []
  params['catalog']['products'].each do |product_param|
    products << Product.create(product_param)
  end
  "Successfully created #{products.count} products"
end

