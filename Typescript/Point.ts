
interface Point {
    x: number;
    y: number;
}

function getX(point: Point) {
    return point.x;
}

class CPoint {
    constructor(public x:number, public y:number) {}
}

getX(new CPoint(10, 20));
getX({x: 10, y: 20});

// Wrong:
// getX({x: 10});