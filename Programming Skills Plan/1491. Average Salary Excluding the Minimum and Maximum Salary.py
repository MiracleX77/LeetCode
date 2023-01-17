def average( salary) -> float:
    salary.sort()
    salary = salary[1:-1]
    print(salary)
    return round(sum(salary)/len(salary),5)
average([8000,9000,2000,3000,6000,1000])