
def countOdds(low, high):
    return (high-low)//2 +(low %2 or high%2)
