package main

import "fmt"

// 设计一个电子商务平台，含有多种类型商品，如电子产品、家居用品、服装等..
// 商品结构体：包含商品的名称、价格和库存数量等信息
type goods struct {
	name            string
	price           float64
	inventoryAmount int
}

// 定义商品的库存管理功能，包括检查库存数量、更新库存数量和打印库存信息等
type InventoryManagementer interface {
	CheckAmount() int
	UpdateAmount(quantity int)
	PrintInformation()
}

func (g goods) CheckAmount() int {
	return g.inventoryAmount
}
func (g goods) UpdateAmount(quantity int) {
	g.inventoryAmount = quantity
}
func (g goods) PrintInformation() {
	fmt.Println("商品名称：", g.name)
	fmt.Println("商品价格：", g.price)
	fmt.Println("商品库存：", g.inventoryAmount)
}

type Elecctronic struct {
	goods
	brand string
	model string
}

func (e Elecctronic) CheckAmount() {

}
func (e Elecctronic) UpdateAmount(quantity int) {
	e.inventoryAmount = quantity
}
func (e Elecctronic) PrintInformation() {
	fmt.Println("商品名称：", e.name)
	fmt.Println("商品价格：", e.price)
	fmt.Println("商品品牌：", e.brand)
	fmt.Println("商品型号：", e.model)
	fmt.Println("商品库存：", e.inventoryAmount)
}

type Houseware struct {
	goods
	material string
	color    string
}

func (h Houseware) CheckAmount() {

}
func (h Houseware) UpdateAmount(quantity int) {
	h.inventoryAmount = quantity
}
func (h Houseware) PrintInformation() {
	fmt.Println("商品名称：", h.name)
	fmt.Println("商品价格：", h.price)
	fmt.Println("商品材质：", h.material)
	fmt.Println("商品颜色：", h.color)
	fmt.Println("商品库存：", h.inventoryAmount)
}

type Clothing struct {
	goods
	brand    string
	size     string
	color    string
	material string
}

func (c Clothing) CheckAmount() {

}
func (c Clothing) UpdateAmount(quantity int) {
	c.inventoryAmount = quantity
}
func (c Clothing) PrintInformation() {
	fmt.Println("商品名称：", c.name)
	fmt.Println("商品价格：", c.price)
	fmt.Println("商品品牌：", c.brand)
	fmt.Println("商品颜色：", c.color)
	fmt.Println("商品尺寸：", c.size)
	fmt.Println("商品材质：", c.material)
	fmt.Println("商品库存：", c.inventoryAmount)
}

func main() {
	fmt.Println("本平台有商品如下：")

	fmt.Println("—————电子产品类————")

	phone := Elecctronic{
		goods: goods{
			name:            "华为智能手机",
			price:           6999,
			inventoryAmount: 5000,
		},
		brand: "华为",
		model: "mate40pro",
	}

	phone.CheckAmount()
	phone.UpdateAmount(999)
	phone.PrintInformation()

	fmt.Println("————家居用品类————")

	bowl := Houseware{
		goods: goods{
			"xx家迷你碗",
			18.90,
			500,
		},
		material: "陶瓷",
		color:    "白",
	}
	bowl.CheckAmount()
	bowl.UpdateAmount(350)
	bowl.PrintInformation()

	fmt.Println("————衣物类————")

	skirt := Clothing{
		goods: goods{
			"白色气质感连衣裙",
			68.89,
			1000,
		},
		brand:    "脱脂少女girl",
		size:     "S",
		color:    "白色",
		material: "雪纺丝",
	}
	skirt.CheckAmount()
	skirt.UpdateAmount(536)
	skirt.PrintInformation()

	fmt.Println("后续更多商品功能待引入，敬请期待ovo")
}
