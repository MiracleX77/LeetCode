
def nearestValidPoint( x: int, y: int, points ):
    def sortDistance(x):
        return x[1]
    for i in range(len(points)):
        if points[i][0] != x and points[i][1] != y:
            points[i] = [-1,10001]
        else:
            points[i] =  [i,abs(x-points[i][0]) + abs (y-points[i][1])]
    points.sort(key=sortDistance)
    return points[0][0]
nearestValidPoint(3,4,[[1,2],[1,5]])