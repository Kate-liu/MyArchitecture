package rmliu

import "fmt"

// 密码 + 盐（⼀串随机数）再 Hash 的⽅式
// 使⽤了 golang.org/x/crypto/bcrypt，该库实现了 Blowfish 算法

func getCryptPwd(userId string, password string) (string, error) {
	pwd, err := bcrypt.GenerateFromPassword([]byte(userId+password), bcrypt.DefaultCost)

	if err != nil {
		return "", err
	}
	return string(pwd), err
}

func checkPW(userId string, password string, cryptPwd string) bool {
	err := bcrypt.CompareHashAndPassword([]byte(cryptPwd), []byte(userId+password))
	if err != nil {
		return false
	}
	return true
}

func main() {
	userId := "zhangsan"
	password := "123654#$A"

	cryptPwd, _ := getCryptPwd(userId, password)
	ret := checkPW(userId, password, cryptPwd)

	if ret {
		fmt.Println("pass")
	} else {
		fmt.Println("fail")
	}
}
