/**
 * @param {Array} arr
 * @param {number} size
 * @return {Array}
 */
var chunk = function (arr, size) {
    // arr  = [1,2,3,4,5]

    let j = 0;
    let result = new Array();
    
    while (j < arr.length) {
        let chunk = new Array();
        for (i = j; i < j+size && i<arr.length;i++){//0,1,2   3,4,6
            if(i<arr.length){
                chunk.push(arr[i]);
            }else{
                return;
            }
        }
        result.push(chunk)
        j=j+size;
    }
    return result

};
