/*

var arr1=[1,2,3,4,5,true,false,'hello','hye']

// filter the items acc to datatype

function getString(arr1)
{
    let result=[]

    for(let item of arr1)
    {
        if(typeof item == 'string')
        {
            result.push(item)
        }
    }
    
    return result
}

console.log(getString(arr1))


function getNumber(arr1)
{
    let result=[]

    for(let item of arr1)
    {
        if(typeof item == 'number')
        {
            result.push(item)
        }
    }
    
    return result
}

console.log(getNumber(arr1))

function getBoolean(arr1)
{
    let result=[]

    for(let item of arr1)
    {
        if(typeof item == 'boolean')
        {
            result.push(item)
        }
    }
    
    return result
}

console.log(getBoolean(arr1))

*/


// Now doing this Q using Higher Order function

var arr1=[1,2,3,4,5,true,false,'hello','hye']

function getString(item)
{
    return typeof item==='string'
}

function getNumber(item)
{
    return typeof item==='number'
}

function getBool(item)
{
    return typeof item==='boolean'
}

function get(arr1,fn)
{
    let result=[]

    for(let item of arr1)
    {
        if(fn(item))
        {
            result.push(item)
        }
    }

    return result
}

console.log(get(arr1,getString))
console.log(get(arr1,getNumber))
console.log(get(arr1,getBool))

