def pivotIndex(nums):
    for i in range(len(nums)):
        if sum(nums[:i]) == sum(nums[i+1:]):
            return i
pivotIndex([1,7,3,6,5,6])