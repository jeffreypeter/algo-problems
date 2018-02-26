import sys
class LongestCommonPrefix:
    def longestCommonPrefix(self, strs):
        """
        :type strs: List[str]
        :rtype: str
        """
        print("-----------------------------------")
        if(len(strs) == 0):
            return ""
        min = sys.maxsize;

        for str in strs:
            min = len(str) if len(str) < min else min

        for i in range(min, 0, -1):
            temp = strs[0][:i]
            print("Temp:: "+temp)
            flag = 1;
            for str in strs:
                # print(str[:min])
                if str[:i] != temp:
                    flag = 0
                    break;
            if flag == 1:
                print(temp)
                return temp
        print ("No matches")
        return ""

lcp = LongestCommonPrefix()
lcp.longestCommonPrefix(['ahello', 'hel', 'hell'])
lcp.longestCommonPrefix(['hello', 'hel', 'hell'])
lcp.longestCommonPrefix(['aa', 'ab'])
lcp.longestCommonPrefix([])
