require_relative 'DoublyLinkedList.rb'

class Queue

  attr_accessor :queue
  
  def initialize
    @queue = DoublyLinkedList.new
  end  

  def enque(value)
    @queue.insert_at_end(value)  
  end

  def deque
    removed_node = @queue.remove_from_front
    return removed_node
  end

  def tail
    return @queue.last_node.data
  end

end

queue = Queue.new()

queue.enque("Indomie")
queue.enque("Yomi")
queue.enque("UK")

queue.deque

p queue.tail
