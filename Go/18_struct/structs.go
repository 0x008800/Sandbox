package main
import "fmt"

type person struct{
	name string
	age int
}

func main(){
	fmt.Println(person{"0x008800", 20})
	fmt.Println(person{name: "git", age: 56})
	fmt.Println(person{name: "fred"})
	fmt.Println(&person{name: "Ann", age: 87})
	
	s := person{name: "Sean", age: 45}
	fmt.Println(s.name)

	sp := &s
	fmt.Println(sp.age)

	sp.age = 66
	fmt.Println(sp.age)
}
