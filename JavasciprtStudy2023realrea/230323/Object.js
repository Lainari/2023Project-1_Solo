/**
 * 230323 수업
 */
const fruits = [`🍇`,`🍈`,`🍉`,`🍊`,`🍋`,`🍌`];
// 결과 (6) ['🍇', '🍈', '🍉', '🍊', '🍋', '🍌']

const fruits1 = new Array(6);
// 결과 (6) [empty × 6]

const fruits2 = new Array(`🍇`,`🍈`,`🍉`,`🍊`,`🍋`,`🍌`);
// 결과 (6) ['🍇', '🍈', '🍉', '🍊', '🍋', '🍌']

const arrayOfArray = [[1, 2, 3], [4, 5, 6]];
arrayOfArray;
// 결과 (2) [Array(3), Array(3)]

delete fruits2[3];
fruits2;
// 결과 ㅣ (6) ['🍇', '🍈', '🍉', empty, '🍋', '🍌']

fruits[fruits.length-1]
// 결과 : '🍌'

fruits
// 결과 (6) ['🍇', '🍈', '🍉', '🍊', '🍋', '🍌']
fruits[fruits.length]='사과';
// 결과 '사과'

fruits
// 결과 (7) ['🍇', '🍈', '🍉', '🍊', '🍋', '🍌', '사과']
fruits.push('배');
// 결과 8

fruits
// 결과 (8) ['🍇', '🍈', '🍉', '🍊', '🍋', '🍌', '사과', '배']
fruits.unshift('사인머스킷');
// 결과 9
fruits
// 결과 (9) ['사인머스킷', '🍇', '🍈', '🍉', '🍊', '🍋', '🍌', '사과', '배']

fruits.pop()
// 결과 '키위'
fruits
// 결과 (10) ['사인머스킷', '🍇', '🍈', '🍉', '🍊', '🍋', '🍌', '사과', '배', '한라봉']

// 배열 반복하기 : for 문
for(let i = 0; i < fruits.length; i++){
    console.log(fruits[i]);
}
// 위와 밑은 같은 구동
for(let i in fruits){
    console.log(fruits[i]);
}
/** 위 두가지 결과
 *  🍉
    🍊
    🍋
    🍌
 * 
 */

// 해당 배열에서 '라' 를 모두 제거하라
const arr = ['가', '라', '다', '라', '마', '라'];
for(let i = 0; i < arr.length; i++){
    const findIndexNum = arr.indexOf('라');
    if(findIndexNum > -1){
        arr.splice(findIndexNum,1);
    }
}