# [Silver IV] 괄호 - 9012 

[문제 링크](https://www.acmicpc.net/problem/9012) 

## 성능 요약

메모리: 32412 KB, 시간: 40 ms

## 분류

자료 구조, 스택, 문자열

## 학습 과정

### 시도 기록
1. **1차 시도**: 컴파일 에러
   - `from collections import stack` (존재하지 않는 모듈)
   - `!` 연산자 사용 (Python은 `not` 사용)
   - `peek()`, `isempty()` 메서드 사용 (리스트에 없는 메서드)

2. **2차 시도**: TypeError
   - `stack.append()` 인자 누락
   - 출력 형식 오류 (`"No"` → `"NO"`)

3. **3차 시도**: ✅ 성공!

### 핵심 학습 포인트

#### 1. Python 스택 구현
- Python에는 별도의 `stack` 클래스가 없음
- 리스트를 스택으로 활용: `append()`, `pop()`
- 스택 비어있는지 확인: `if not stack:` 또는 `if len(stack) == 0:`

#### 2. 괄호 매칭 알고리즘
```python
# 핵심 로직
for s in PS:
    if s == "(":
        stack.append(s)  # 여는 괄호는 무조건 push
    elif s == ")" and stack and stack[-1] == "(":
        stack.pop()      # 짝이 맞으면 pop
    elif s == ")":
        stack.append(s)  # 짝이 안 맞으면 push (Invalid 표시)
```

#### 3. 실수했던 부분
- **문법 실수**: C/C++ 스타일 문법 사용 (`!`, `peek()`)
- **메서드 사용**: `append()` 인자 누락
- **출력 형식**: 대소문자 정확히 지켜야 함

### 개선 가능한 부분

현재 코드는 닫는 괄호 `)`를 스택에 넣어서 Invalid를 표시하지만, 
더 효율적으로는 즉시 break하고 NO를 출력할 수 있음:

```python
valid = True
for s in PS:
    if s == "(":
        stack.append(s)
    else:  # s == ")"
        if not stack:
            valid = False
            break
        stack.pop()

if valid and not stack:
    print("YES")
else:
    print("NO")
```

## 관련 문제 추천
- [백준 4949 - 균형잡힌 세상](https://www.acmicpc.net/problem/4949): 여러 종류 괄호
- [백준 1874 - 스택 수열](https://www.acmicpc.net/problem/1874): 스택 응용
- [백준 10799 - 쇠막대기](https://www.acmicpc.net/problem/10799): 괄호 활용

---
*2025-09-16 학습 완료 with Claude*