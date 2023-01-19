def subtractProductAndSum(n: int) -> int:
    list_digit= list(map(int,str(n))) # 234 >> [2,3,4]
    sum_digit = 0
    pro_digit = 1 # not 0 is i * 0 == 0
    for i in list_digit:
        pro_digit *= i
        sum_digit += i
    return pro_digit - sum_digit
subtractProductAndSum(234) 