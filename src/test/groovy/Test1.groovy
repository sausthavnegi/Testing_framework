class Test1 extends ParentTest {
    Test1(){
        this.testnumber ="1"
        this.testcase ="Test1"
        this.orderlifecycle =[
                "85052=2021; 73103=A; 6440=0, 96051=Global;",
                "85052=2022; 73103=B; 6440=1, 96051=Global1;",
                "85052=2022; 73103=C; 6440=2, 96051=Global2;",
        ]
        this.dsolFields = [
                "Event","Date",'rootid'
        ]

        this.eventsToValidate=[["Event":"onew","Date":"124","rootid":"id1"],
                                ["Event":"osum","Date":"124","rootid":"id2"],
                               ["Event":"exec","Date":"124","rootid":"id3"],

        ]
    }
}
