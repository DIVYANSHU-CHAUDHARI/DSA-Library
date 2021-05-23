    def checkZeroOnes(self, s: str) -> bool:
        max_count_zero = max(map(len,s.split('1')))
        max_count_one = max(map(len,s.split('0')))
        diffCount = max_count_one-max_count_zero
        return True if diffCount>0 else False
