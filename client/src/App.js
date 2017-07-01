/*@flow*/
import React, { Component } from 'react';

import { BrowserRouter as Router, Route} from 'react-router-dom';
import routes from './routes/Routes';

import repo from './Repo';

import "./styles/libs/font-awesome/css/font-awesome.min.css";



class App extends Component {
  render() {
    return (
          <div>
              <Router>
                <div>
                  {routes.map((route, i) => {
                      return(
                        <Route exact={route.exact} path={route.path} render={() => {
                            return <route.component getPosts={repo}/>;
                          }               
                        } key={i}/>
                      );
                  })}
                </div>
              </Router>
          </div>
    );
  }
}

export default App;
