//                                  HOISTING

// JavaScript Hoisting refers to the process whereby the interpreter appears to move the declaration of functions, variables, classes, or imports to the top of their scope, prior to execution of the code.

// Hoisting is not a term normatively defined in the ECMAScript specification. The spec does define a group of declarations as HoistableDeclaration, but this only includes function, function*, async function, and async function* declarations. Hoisting is often considered a feature of var declarations as well, although in a different way. In colloquial terms, any of the following behaviors may be regarded as hoisting:

// Being able to use a variable's value in its scope before the line it is declared. ("Value hoisting")
// Being able to reference a variable in its scope before the line it is declared, without throwing a ReferenceError, but the value is always undefined. ("Declaration hoisting")
// The declaration of the variable causes behavior changes in its scope before the line in which it is declared.
// The side effects of a declaration are produced before evaluating the rest of the code that contains it.



// console.log(a)  //error aayega ....a not found

// var a / let a / const a
// console.log(a)  //undefined aayega

// console.log(a)
// var a=5 / let a=5 /const a=5   hoisting hogi

// hoisting

// var a / let a / const a
// console.log(a)
// a=5

// but var waale ka undefined accessable hota h to var waale case mein undefined aayega but let aur const ke case mein error aayega kyoki let aur comst undefined ko acess krne ki permission nhi dete

// hoisting is also done in the  functions
// normal function declaration var ki trh hoisting krke undefined deta 
// but var/let/const=> arrow waale function mein let aur const ki trh error aayega


    	                    // BLOCK 


// {
//     let a=5
//     console.log(a)   //5 aayega
// }

//     console.log(a) //a not defined aayega   kyoki a jo h block mein bnd h uski alg hi duniya h but agr var hota to 5 aa jata kyoki var ka scope is always global

//     let a=5
//     {
//         console.log(a) //5 aayega kyoki abhi jo h let global variable h kisi scope ke andr nhi h
//     }

// let b=4
// {
//     let b=3
//     console.log(b)   //3 aayega
// }
// console.log(b)    //4 aayega kyoki 3 to andr h but dono jgh var hota to 3 hi aata dono jgh

// var b=4
// {
//     var b=3
//     console.log(b)   //3 aayega
// }
// console.log(b) //3 aayega

// var x=4
// function neww()
// {
//     console.log(x)
//     var x=4
// }
// neww()





                        // HIGHER ORDER FUNCTION 

// i)Higer order function is function which has function in its argument (while calling)

// function inner()
// {
//     console.log('hye inner')
// }

// function outer(a)
// {
//     console.log('hye outer')
//     a()
// }

// outer(inner)

// ii)HIgher order function is one which returns function

// function outer()
// {
//     console.log('outerrr')
//     function inner()
//     {
//         console.log('inerrr')
//     }
//     return inner()
// }

// outer()
