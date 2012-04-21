
class Tree
    attr_accessor :children, :node_name

    def initialize(name, children=[])
        @children = children
        @name = name
    end
    
    def visit_all(&block)
        visit &block
        children.each {|c| c visit_all &block}
    end
    
    def visit(&block)
        block.call self
    end
end

mytree = Tree.new("Ruby",
    [Tree.new("Scala"), Tree.new("Python")])
    

