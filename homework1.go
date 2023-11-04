package main

import (
	"fmt"
	"math"
)

func sum(x int, y int) int {
	rs1 := x + y
	return rs1
}
func s(r float32) float32 {
	rs2 := r * r * math.Pi
	return rs2
}
func Prime_Number(m int) string {
	i := "不是哦"
	j := "是的"
	if m%2 == 0 && m > 2 {
		fmt.Println(i)
	} else if m%3 == 0 && m > 3 {
		fmt.Println(i)
	} else if m%5 == 0 && m > 5 {
		fmt.Println(i)
	} else if m%7 == 0 && m > 7 {
		fmt.Println(i)
	} else {
		fmt.Println(j)
	}

	return "判断结束"
}

func main() {
	rs1 := sum(12, 20)
	fmt.Println(rs1)
	rs2 := s(3.2)
	fmt.Println(rs2)
	rs3 := Prime_Number(65)
	fmt.Println(rs3)

	fmt.Println("-----------------------------------------------------------------------")

	//rand.Seed(time.Now().UnixNano())
	//Number := rand.Intn(101) // [0,n)
	//fmt.Println("目标数字：", Number)
	//for {
	//	if Number == 50 {
	//		fmt.Println("目标数字:50")
	//	} else if Number > 50 && Number == 75 {
	//		fmt.Println("目标数字:75")
	//	}
	//
	//}
}
