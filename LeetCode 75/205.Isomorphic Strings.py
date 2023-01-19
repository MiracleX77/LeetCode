def isIsomorphic( s: str, t: str):
    dict = {}
    for i in range(len(s)):
        if s[i] not in dict and t[i] not in dict.values():
            dict.update({s[i]:t[i]})
        elif s[i] not in dict:
            dict.update({s[i]:""})
    print(dict)
    for j in range(len(s)):
        if dict[s[j]]!=t[j]:
            return False
    return True
isIsomorphic("badc","bala")