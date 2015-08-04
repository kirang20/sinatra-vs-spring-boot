class User < ActiveRecord::Base
  validates_presence_of :name, :phone_number, :type
end
