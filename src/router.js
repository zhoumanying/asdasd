import React from 'react';
import { Router, Route } from 'dva/router';
import IndexPage from './routes/IndexPage'
import TodoList from './routes/TodoList'
import UserDemo from "./routes/UserDemo";

function RouterConfig({ history }) {
  return (
    <Router history={history}>
        <Route path="/" component={IndexPage} />
        <Route path='/todoList' components={TodoList}/>
        <Route path='/user' components={UserDemo}/>
    </Router>
  );
}

export default RouterConfig;
