By using Adapter Pattern we can communicate between 2 or many interface.
This is example:
    - We have interface IShape, this interface have a method draw with parameter: x1, y1, x2, y2 to draw 
        => draw(x1, y1, x2, y2)
    - During implementation, developer implement 2 shape which are implemented from IShape.
    - But Rectangle need to be tranfered 4 parameter: x1, y1, x1 + x2, y1 + y2
    - Line need to be tranfered 4 parameter: x1, y1, h, w
    => need to create LineAdapter and RectangleAdapter to communicate between IShape and (Rectangle, Line)
    => this help us dont need to change any thing in IShape or (Rectangle, Line)