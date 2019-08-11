# codility
***해결했지만 아래 링크에 없는 문제도 있습니다.
소스는 있으니 다운받아 보시면 됩니다. <br />
(복습 겸 다시 풀어 링크 추가 예정, 추가 후 해당 문구 삭제 예정)***
## 01 Iterations
## 02 Arrays
## 03 Time Complexity
## 04 Counting Elements
## 05 Prefix Sums
## 06 Sorting
- Distinct (10 mins)
    >https://app.codility.com/demo/results/training4ESK5A-ZST/  (100%)
    >
        TreeSet이 아닌 HashSet 사용 (순서 필요없이 단순 중복제거용이므로)
## 07 Stacks and Queues
- Nesting (18 mins)
    >https://app.codility.com/demo/results/trainingK46G4V-4UR/  (62%)
    https://app.codility.com/demo/results/trainingXQR94S-EGZ/  (75%)
    https://app.codility.com/demo/results/trainingNVFCC8-AMM/  (100%)
    >
        S의 값이 비어있어도 참을 놓침
        stack의  값을 잘못 계산함
## 08 Leader
- EquiLeader (111 mins)
    >https://app.codility.com/demo/results/trainingQWKCEA-6YN/  (33%)
    https://app.codility.com/demo/results/training6NQGGH-AWZ/  (100%)
    >
        논리 이슈, Performance 이슈
        양 쪽의 equi Leader 카운트 시 조건문 변경하여 계산
## 09 Maximum slice problem
- MaxProfit (36 mins)
   >https://app.codility.com/demo/results/trainingURR32N-GKE/  (44%)
   https://app.codility.com/demo/results/trainingTVPXWK-6UX/  (100%)
   >
      최소값 nMin 변수
      인덱스가 높은 배열에서 nMin 변수를 빼면서 가장 큰 차액 데이터 보관
      Math.min(nMin, n) / Math.max(nMax, n-nMin)
      
- MaxSliceSum (54 mins)
    >https://app.codility.com/demo/results/trainingW4A93M-5T3/  (69%)
    https://app.codility.com/demo/results/trainingHNSN8Q-BVV/  (100%)
    >
        {3,-2, 3}인 경우 실패 (3이 아닌 4가 나와야 함, 3-2+3=4)
        음수와 양수가 섞인 경우 음수를 기준으로 slice 한다는 가정에서 오류

## 10 Prime and Composite Numbers
- CountFactors (11 mins)
    >https://app.codility.com/demo/results/training4477RF-9WB/  (71%, Performance 이슈)
    https://app.codility.com/demo/results/trainingEEZHBR-X6C/  (100%)
    >
        약수 구하기
        O(N) 방식으로 풀면 시간초과 (Performance 이슈)
        O(sqrt(N))으로 풀어야 함
        (int) Math.sqrt(N)

- MinPerimeterRectangle (14 mins)
    >https://app.codility.com/demo/results/trainingAD5M68-6TJ/  (100%)
    >
        공약수 구하는 문제
## 11 -
## 12 Euclidean Algorithm
- ChocolatesByNumbers (0 mins)
    >https://app.codility.com/demo/results/trainingKFZVE4-888/  (100%)
    >
        처음부터 참고
        최대 공약수 구해서 N/최대 공약수
## 13 -
## 14 -
## 15 Caterpillar Method
- AbsDistint (14 mins)
    >https://app.codility.com/demo/results/trainingTPFJJ4-EPV/  (100%)

- CountTriangles
    >https://app.codility.com/demo/results/trainingQ776CZ-C7U/ (100%)
    >
        처음부터 참고
        아직도 triangeCnt += r - q - 1; 이 부분은 잘 이해가 안감

## 16 Greedy Algorithms
- TieRopes (16 mins)
    >https://app.codility.com/demo/results/trainingQKBWMK-MJB/  (12%)        
    https://app.codility.com/demo/results/trainingUW5WNX-4JT/  (100%)
    >
        묶인 밧줄의 갯수를 리턴하는 것으로 잘못 이해함.
        최종적으로 나눠진 밧줄의 갯수를 리턴하는 것이었음.

## 92 Tasks from Indeed Prime 2016 College Coders challenge
- TennisTournament (22 mins)
    >https://app.codility.com/demo/results/trainingXCT9MU-QBN/  (100%)

## 99 Future training 
- SqlSum (1 mins)
    >https://app.codility.com/demo/results/trainingYN6B48-RF6/  (100%)

- StrSymmetryPoint

- TreeHeight