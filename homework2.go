package main

import "fmt"

// 简易计算器

type operator func(int, int) int

func add(num1, num2 int) int {
	return num1 + num2
}
func sub(num1, num2 int) int {
	return num1 - num2
}
func mul(num1, num2 int) int {
	return num1 * num2
}
func div(num1, num2 int) int {
	return num1 / num2
}

func Calculator(num1, num2 int, result operator) int {
	return result(num1, num2)
}
func main() {
	rs1 := Calculator(12, 20, add)
	fmt.Println("答案为：", rs1)
	rs2 := Calculator(12, 20, sub)
	fmt.Println("答案为：", rs2)
	rs3 := Calculator(12, 20, mul)
	fmt.Println("答案为：", rs3)
	rs4 := Calculator(12, 2, div)
	fmt.Println("答案为：", rs4)
}
