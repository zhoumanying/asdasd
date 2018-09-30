import React from 'react';
import {connect} from 'dva'

class UserDemo extends React.Component
{
  constructor(props)
  {
    super(props)
    this.state = {
      value: '',
      list:[1,2,3,4,5,6]
    }
  }
  gg(index){
    console.log(5455555)
    this.props.dispatch({
      type: 'user/query',
      payload: index
    })
  }
  render(){
    return (
      <ul>
        {
          this.state.list.map((item,index)=>{
            return (
              <li key={index}>{item}<button onClick={()=>this.gg(index)}>点击</button></li>
            )
          })
        }
      </ul>
    )
  }
}
export default connect()(UserDemo)
