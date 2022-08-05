class Test2 extends ParentTest {
    Test2(){
        this.testnumber ="1"
        this.testcase ="Test2"
        this.orderlifecycle =[
                "85052=2021; 73103=A; 6440=0, 96051=Global;",
                "85052=2022; 73103=B; 6440=1, 96051=Global1;",
                "85052=2022; 73103=C; 6440=2, 96051=Global2;",
        ]
        this.dsolFields = [
                "Event","Date",'rootid',"test"
        ]

        this.eventsToValidate=[["Event":"onew","Date":"124","rootid":"id1"],
                               ["Event":"exec","Date":"124","rooid":"id2"],
                               ["Event":"new","Date":"124","rooid":"id3"],
                               ["Event":"news","Date":"125","rooid":"id6"],

        ]
    }
}
