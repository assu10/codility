# codility

### Source Naming
CyclicRotation : 내가 해결한 것<br />
CyclicRotation***Modify*** : 검색하여 얻은 해결<br />
CyclicRotation***Second*** : 2번째 내가 해결한 것(나중에)<br />
CyclicRotation***SecondModify*** : 검색하여 얻은 해결(나중에)<br />

## 01 Iterations

- BinaryGap (38 mins) - 연속된 0의 갯수
    >https://app.codility.com/demo/results/trainingMA8RDH-CMV/  (100%)
    >
        연속되는 0의 최대 갯수 구하는 문제
        숫자를 이진수로 변경하는 법
            Integer.toBinaryString(N)

## 02 Arrays

- OddOccurrencesInArray (18 mins) - 홀수 개인 숫자
    > https://app.codility.com/demo/results/trainingSSES8M-URY/  (100%)  
    https://app.codility.com/demo/results/trainingFGTW3B-SWJ/  (100%)
    >
        짝을 이루지 않는 값 찾는 문제
        hashMap key값 가져오기
            for (Map.Entry<Integer, Integer> entry : hMap.entrySet())
        첫 번째 방법도 100% 이지만 반복문을 두 번 돌리지 않고 한번에 하는 방법으로 개선

- CyclicRotation - 배열 이동
    >https://app.codility.com/demo/results/trainingETGJVN-X3S/  (100%)
    >
        처음부터 참고.
        수학적 접근 필요

## 03 Time Complexity

- ~~FrogJmp (5 mins)~~
    >https://app.codility.com/demo/results/training9QJ7BS-KMD/  (100%)
    >
        반복문이 아닌 수학적으로 접근

- PermMissingElem (6 mins) - 배열 중간에 빠진 숫자 리턴
    >https://app.codility.com/demo/results/trainingXNAFCU-FB3/  (50%)
    https://app.codility.com/demo/results/trainingWPG5X9-65J/  (50%)
    https://app.codility.com/demo/results/trainingPP76RN-RF3/  (100%)
    >
        빈 배열일 경우 0이 아닌 1 리턴해야 함.
        1~N+1 의 범위이므로 {1}인 경우 2 리턴.

- TapeEquilibrium (18 mins)
    >https://app.codility.com/demo/results/trainingVBBRMM-RSS/  (84%)
    https://app.codility.com/demo/results/trainingQDMG46-EYH/  (92%, Performance 이슈)
    https://app.codility.com/demo/results/trainingVJ7Y5S-GUS/  (100%)
    >
        {-1000,1000} 인 경우 -2000 리턴
        전체 합을 스트림(IntStream.of(A).sum())이 아닌 반복문으로 개선하여 성능 향상

- ~~MaxCounters - Respectable (79 mins)~~
    >https://app.codility.com/demo/results/trainingMAVYQB-6TT/  (100%)
    >
        N보다 큰 배열 요소 추출 ([2,4,4,6,1,2,6,2] -> [2,4,4],[1,2],[2] 에서 [2,4,4],[1,2])
        배열 요소의 갯수-1 (마지막은 increase 적용해야 하므로) 개의 배열에서 각각 제일 많이 반복되는 숫자의 갯수 더해줌
        더해준 수를 기본 갯수로 셋팅 (0이 아닌)
        이 후 마지막 배열에서 increase 수행


- (TO DO) MissingInteger - Respectable


## 04 Counting Elements

- PermCheck (6 mins)
    >https://app.codility.com/demo/results/trainingR7CP95-84S/  (100%)

## 05 Prefix Sums

- ~~PassingCars (18 mins)~~
    >https://app.codility.com/demo/results/trainingA3SQ4D-THQ/  (50%)
    https://app.codility.com/demo/results/trainingXTY4B8-RD6/  (100%)
    >
        로직은 맞으나 퍼포먼스 이슈
        O(N ** 2) -> O(N) 로 개선

- (TO DO) MinAvgTwoSlice - Respectable

## 06 Sorting

- ~~MaxProductOfThree (10 mins)~~ - 배열 중 곱했을 때 가장 큰 수
    >https://app.codility.com/demo/results/trainingVP52WH-PNQ/  (100%)

- ~~Distinct (10 mins)~~ - 배열의 고유값 갯수 세기
    >https://app.codility.com/demo/results/training4ESK5A-ZST/  (100%)
    >
        TreeSet이 아닌 HashSet 사용 (순서 필요없이 단순 중복제거용이므로)

- Triangle (23 mins)
    >https://app.codility.com/demo/results/trainingCEMEJ3-YKU/  (68%)
    https://app.codility.com/demo/results/trainingBCB8VP-D72/  (100%)
    >
        로직 오류.
        함수 사용 필요.
        overflow 고려.

- (TO DO) NumberOfDiscIntersections - Respectable

## 07 Stacks and Queues

- ~~Brackets (24 mins)~~ - 괄호 정합성 체크
    >https://app.codility.com/demo/results/trainingM4JPSZ-SPF/  (100%)

- Fish (43 mins) - 살아남은 물고기 갯수
    >https://app.codility.com/demo/results/training9EPCFM-W5K/  (37%)
    https://app.codility.com/demo/results/trainingUK2PJR-D82/  (100%)
    >
        처음부터 해결방향 참고함.
        한 쪽의 케이스를 스택에 담아놓고 비교.
        스택에 남아있는 요소 갯수가 아닌 별도 변수

- Nesting (18 mins)
    >https://app.codility.com/demo/results/trainingK46G4V-4UR/  (62%)
    https://app.codility.com/demo/results/trainingXQR94S-EGZ/  (75%)
    https://app.codility.com/demo/results/trainingNVFCC8-AMM/  (100%)
    >
        S의 값이 비어있어도 참을 놓침
        stack의  값을 잘못 계산함

- StoneWall
    >https://app.codility.com/demo/results/trainingAXM8J7-UX7/  (100%)
    >
         처음부터 참고
         스택 이용
         높이가 이전 벽돌보다 작으면 비교 대상 제거
         높이가 이전 벽돌보다 높으면 새로운 벽돌
         높이가 같으면 넘김 (=같은 벽돌)

## 08 Leader

- ~~Dominator (11 mins)~~ - 배열 중 절반이 넘는 값의 인덱스 리턴
    >https://app.codility.com/demo/results/trainingVMMDJV-7B7/  (100%)

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
        Math.min(nMin, n)
        Math.max(nMax, n-nMin)
      
- MaxSliceSum (54 mins)
    >https://app.codility.com/demo/results/trainingW4A93M-5T3/  (69%)
    https://app.codility.com/demo/results/trainingHNSN8Q-BVV/  (100%)
    >
        {3,-2, 3}인 경우 실패 (3이 아닌 4가 나와야 함, 3-2+3=4)
        음수와 양수가 섞인 경우 음수를 기준으로 slice 한다는 가정에서 오류

- (TO DO) MaxDoubleSliceSum - Respectable

## 10 Prime and Composite Numbers

- CountFactors (11 mins) - 인수구하기, sqrt
    >https://app.codility.com/demo/results/training4477RF-9WB/  (71%, Performance 이슈)
    https://app.codility.com/demo/results/trainingEEZHBR-X6C/  (100%)
    >
        약수 구하기
        O(N) 방식으로 풀면 시간초과 (Performance 이슈)
        O(sqrt(N))으로 풀어야 함
            (int) Math.sqrt(N)

- ~~MinPerimeterRectangle (14 mins)~~ - 공약수
    >https://app.codility.com/demo/results/trainingAD5M68-6TJ/  (100%)
    >
        공약수 구하는 문제

## 11 -

## 12 Euclidean Algorithm

- ChocolatesByNumbers - 최대 공약수
    >https://app.codility.com/demo/results/trainingKFZVE4-888/  (100%)
    >
        처음부터 참고
        최대 공약수 구해서 N/최대 공약수

## 13 -

## 14 -

## 15 Caterpillar Method

- CountDistinctSlices (52 mins) - 고유값 갯수
    >https://app.codility.com/demo/results/trainingWG6ACZ-2YT/  (70%)
    https://app.codility.com/demo/results/trainingMA2M84-YWX/  (100%)
    >
        로직은 맞았으나 퍼포먼스 이슈.
        O(N * (N + M)) -> O(N)으로 개선
        역시나 caterpillar는 아직 잘 이해가 안감.
        나중에 좀 깊게 봐야겠음... 

- CountTriangles
    >https://app.codility.com/demo/results/trainingQ776CZ-C7U/ (100%)
    >
        처음부터 참고
        아직도 triangeCnt += r - q - 1; 이 부분은 잘 이해가 안감

- ~~AbsDistint (14 mins)~~
    >https://app.codility.com/demo/results/trainingTPFJJ4-EPV/  (100%)

        
## 16 Greedy Algorithms

- TieRopes (16 mins)
    >https://app.codility.com/demo/results/trainingQKBWMK-MJB/  (12%)        
    https://app.codility.com/demo/results/trainingUW5WNX-4JT/  (100%)
    >
        묶인 밧줄의 갯수를 리턴하는 것으로 잘못 이해함.
        최종적으로 나눠진 밧줄의 갯수를 리턴하는 것이었음.

- MaxNonoverlappingSegments
    >https://app.codility.com/demo/results/trainingW3M8SP-JNY/  (100%)
    >
        처음부터 참고함.
        A={1,3} / B={5,6} 인 경우 겹치지 않는 세그먼트가 없으니 0을 리턴해야 하는데
        int segCnt = 1; 왜 기본적으로 1을 깔고 가는지 이해가 안감.

## 90 Task from Indeed Prime 2015 challenge

- LongestPassword (32 mins) - 정규식
    >https://app.codility.com/demo/results/trainingDCF3DA-ETS/  (30%)
    >https://app.codility.com/demo/results/trainingYD5VX7-5UW/  (70%)
    >https://app.codility.com/demo/results/trainingG8M2AF-5EW/  (100%)
    >https://app.codility.com/demo/results/trainingKTT9UZ-MFE/  (100%)
    >        
        정규식 사용
        숫자 1개로만으로 구성 가능한 부분 놓침 (알파벳은 짝수이므로 0개여도 됨)
        charAt 비교 시 숫자가 아닌 char로 비교할 것
            s.charAt(i) >= '0'
        이중 반복문 개선

## 92 Tasks from Indeed Prime 2016 College Coders challenge

- ~~TennisTournament (22 mins)~~
    >https://app.codility.com/demo/results/trainingXCT9MU-QBN/  (100%)

## 99 Future training 

- ~~SqlSum (1 mins)~~
    >https://app.codility.com/demo/results/trainingYN6B48-RF6/  (100%)

- ~~StrSymmetryPoint (17 mins)~~
    >https://app.codility.com/demo/results/trainingSNKBXM-8GA/  (100%)

- TreeHeight - 이진트리 길이
    >https://app.codility.com/demo/results/trainingPSBAES-Q5Z/  (100%)
    >
        처음부터 참고
        이진트리 길이구하는 문제