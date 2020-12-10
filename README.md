## Step 2

1. 큐브를 출력해 줄 printCube 메소드
    - 큐브는 더블 어레이를 사용, 이중 for loop을 이용해 윗줄부터 차례대로 출력해준다.
2. takeInputs 메소드에서 스캐너를 이용해 인풋을 저장한다. 인풋이 "Q" 라면 init 메소드에서 걸러져 프로그램이 종료된다.
3. 저장된 인풋에 따라 방향을 정하고 큐브를 움직여준다(moveCube)
    - input을 한 글자씩 떼어내 direction에 저장한다. 떼어낸 자리 다음 자리값에 작은 따옴표가 있다면 이것도 같이 direction에 저장한다.

    ```
    String direction = "";
    if (inputs.charAt(i) == '\'') {
        continue;
    }
    direction += inputs.charAt(i);

    if ((i != inputs.length() - 1) && (inputs.charAt(i + 1) == '\'')) {
        direction += "'";
    }
    ```

    - 해당 direction을 먼저 한 번 출력해 준 다음 matchDirection에 넣어 주어진 방향대로 움직여 줄 메소드를 매치시켜준다.

    ```
    switch (direction) {
        case "U":
            moveLeft(0);
            break;
        case "U'":
            moveRight(0);
            break;
        case "R":
            moveUp(2);
            break;
        case "R'":
            moveDown(2);
            break;
        case "L":
            moveDown(0);
            break;
        case "L'":
            moveUp(0);
            break;
        case "B":
            moveRight(2);
            break;
        case "B'":
            moveLeft(2);
            break;
    }
    ```

    - 큐브를 움직여주는 메소드의 예

    ```
    private void moveLeft(int index) {
        String temp = cube[index][0];
        for (int i = 0; i < cube[index].length - 1; i++) {
            cube[index][i] = cube[index][i + 1];
        }
        cube[index][cube[index].length - 1] = temp;
    }
    ```