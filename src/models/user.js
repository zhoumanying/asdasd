
import queryString from 'query-string';
import * as userService from '../services/user'


export default {

  namespace: 'user',
  state:{
    list:[1,2,3,4]
  },

  effects:{

    *query({payload},{call,put,select})
    {
      console.log(121212)
      console.log(payload)
      const data = yield call(userService.query,payload)
      let userList = yield select(state=>state.user.list)
      userList.push(5)
      console.log(userList)
    }
  },
  reducers: {
    save(state, { payload: { list } }) {
      return { ...state, list }
    }
  },
  subscriptions:{
    setup({ dispatch, history }) {
      // 监听路由的变化，请求页面数据
      console.log(2222)
      return history.listen(({ pathname, search }) => {
        const query = queryString.parse(search)
        let list = []
        if (pathname === '/user') {
         console.log(222222)
        }
      })
    }
  }
}
