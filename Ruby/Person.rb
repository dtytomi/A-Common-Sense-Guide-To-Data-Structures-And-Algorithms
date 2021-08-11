class Person
  
  attr_accessor :name, :friends

  def initialize(name)
    @name = name
    @friends = []
  end

  def add_friend(friend)
    @friends << friend
  end

end


mary = Person.new("Mary")
peter = Person.new("Peter")


mary.add_friend(peter)
peter.add_friend(mary)

