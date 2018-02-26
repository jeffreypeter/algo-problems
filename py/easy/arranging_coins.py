class ArrangingCoins:
    def __init__(self):
        print("test")

    def arrangeCoins(self, n):
        """
        :type n: int
        :rtype: int
        """
        temp = n;
        count = 0
        for x in range(1, n+1):
            n = n - x
            # print(n)
            if n >= 0:
                count = count + 1
                # print('count:: '+str(count))
            else:
                break

        print("n::"+str(temp)+";count::"+str(count))
        return count

ac = ArrangingCoins()
ac.arrangeCoins(5)
ac.arrangeCoins(8)
ac.arrangeCoins(0)
ac.arrangeCoins(1)


