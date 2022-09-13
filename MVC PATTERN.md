# MVC Pattern
* 프로그램의 유지보수가 편해지는 코드구성을 위한 디자인 패턴

```
* MVC Pattern
$ M : Model
$ V : View
$ C : Controller
```

* Rules of MVC
```
* Rules of MVC
$ 1. Model : Controller / View 에 의존하지 않음
  → 모델 내부에 Controller / View 관련된 코드가 있으면 안됨
$ 2. View : Model 에만 의존 / Controller 에 의존하지 않음
  → View 내부에는 Model 코드가 존재해도 됨.
  → Controller 코드는 존재하면 안됨
$ 3. View가 Model 로 데이터를 받을 경우
  → 사용자마다 다르게 보여주어야 하느 데이터에 대해서만 받아야함
$ 4. Controller : Model / View 에 의존하여도 됨
  → Controller = Model / View 의 중재자
$ 5. View 단계에서 Model 로 부터 데이터를 받을때 Controller 를 거쳐야 함
```

* Role of MVC
```
$ Model : 프로그램의 Logic / 데이터 담당
$ View : Model 단계를 포연하기 위해 사용자 인터페이스(UI) 제공
$ Controller : (View/Model) 사이에 위치하여 사용자로부터 정보입력
  → Model을 통해 정보 처리
  → View 에게 전달
```
