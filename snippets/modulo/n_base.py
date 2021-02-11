# n進数に変換した文字列を返す
def n_base(x, n=10):
    res = ''
    while x > 0:
        res = str(x % n) + res
        x //= n
    return res


if __name__ == '__main__':
    print(f'{n_base(16)=}')
    print(f'{n_base(16, 16)=}')
    print(f'{n_base(16, 2)=}')
