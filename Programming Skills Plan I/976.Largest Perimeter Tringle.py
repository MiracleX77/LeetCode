def largestPerimeter(nums):
    #sum of two side must less than big side
    nums.sort(reverse = True)
    for i in range (3,len(nums)+1):
        if nums[i-3]<nums[i-2]+nums[i-1]:
            return sum(nums[i-3:i])
    return 0
largestPerimeter([2,1,2,1,5,7,5])