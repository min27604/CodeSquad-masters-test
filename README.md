## Step 1
1. 받은 인풋을 스페이스 기준으로 나누어 temp 어레이에 임시 보관
2. 변수를 선언하고 temp 에 있는 값을 하나씩 지정. word 는 알파벳의 이동이 필요, 리스트에 알파벳 하나하나 저장 
3. direction 값과 num 값의 양/음수 여부를 가지고 조건문 두가 생성
4. direction: "L", num > 0 일 경우와 direction: "R', num < 0 인 경우 두 가지는 앞의 알파벳이 뒤로 밀리므로 인덱스 0의 값을 tem 변수에 저장 후 remove 메소드를 이용해 삭제, 인덱스 값이 앞으로 당겨짐. tem 에 저장해둔 값은 add 메소드를 이용해 리스트 제일 끝 인덱스 자리에 넣어줌
5. direction: "R", num > 0 일 경우와 direction: "L", num < 0 인 경우 두 가지는 뒤의 알파벳이 앞으로 밀리므로 word 의 사이즈값을 이용, 마지막 인덱스 값을 4번에서 쓴 방법과 같이 tem 에 임시 저장 후 삭제, add 메소드를 이용해 앞으로 이동    