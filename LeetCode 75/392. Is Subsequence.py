def isSubsequence(s: str, t: str):
    if len(s) > len(t):return False
    if len(s) == 0: return True
    sub_count = 0
    for i in range(len(t)):
        if sub_count<=len(s)-1:
            if s[sub_count] == t[i]:
                sub_count+=1 
    return sub_count == len(s)

isSubsequence("a","d")