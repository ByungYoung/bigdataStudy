# DATA STRUCTURE
* 데이터 or Process를 어떤방식으로 저장할 것인지에 대한 구조

```
* List <Linear>
* stack <First In Last Out>
* Queue <First In First Out>
* Tree {Binary tree : per one node has two node}
* Map
```

# 1. List
```
* 단점 : 데이터 추가, 삭제 시 메모리에 정보 복사가 일어남으로 메모리 낭비가 발생한다.
 → 속도 느림. Linked List(Header | Putter) 문제점 보완
* 장점 : Index가 있어 번호를 부여하거나 순서를 부여하는 등에 적합하다.
```

# 2. Stack <First In Last Out>
  → 프로세스(Process) 저장에 쓰임. Thread (프로세스 병렬 처리)에 쓰임
```
* push : 추가
* pop : 최상위 삭제
* clear : 전체 삭제
* peek : 확인
```

# 3. Queue <First In First Out>
  → 프로세스(Process) 저장에 쓰임. Thread (프로세스 병렬 처리)에 쓰임
```
* push : 추가
* pop : 최하위 삭제
* clear : 전체 삭제
* peek : 확인
```

# 4. Tree
```
* 파일 시스템 (File Management) : 추가, 삭제, 검색에 빠름
* Directory
```

# 5. Map
 → Hash Map
 → Key = Unique
```
# [Iterator : 모든 키값을 가져옴]
* Key 값으로 Value를 꺼냄
* get(key)
* put(key,value)
* remove(key)
* clear
```

# 6. set
 → 값 중복할 수 없음.
