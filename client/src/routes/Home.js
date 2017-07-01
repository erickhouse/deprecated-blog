/*@flow*/
import React, { Component } from 'react';
import PostHeading from "../components/Post";
import routes from '../routes/Routes'
import {Link} from 'react-router-dom';
import {Row, Col, Grid} from 'react-bootstrap';

class Home extends Component {

    constructor(props) {
        super(props);

        this.state = {
            posts: []
        };
    }
    componentDidMount(){
        this.props.getPosts((data) => {
            this.setState({posts:data})
        });
    }
    componentWillMount(){
    }

    renderNavBar(){
        return <div className="NavBar bg-gray-dark">

            <div className="container">      
            <ul>
                <div className="Left"> 
                    <h3 className="text-white py-3"> Erick House </h3>
                </div>
                <div className="Right">
                <li>                        
                    <a href="https://github.com/erickhouse1">
                        <i className=" fa fa-github fa-fw fa-2x fa-fw"/> 
                            <div> Github </div>
                    </a>
                </li>
                <li>                            
                    <a href="https://github.com/erickhouse1">
                        <div className="fa fa-linkedin-square fa-2x fa-fw"/>
                            <div> LinkedIn </div>
                    </a>
                </li>
                <li>                            
                    <a  href="https://github.com/erickhouse1">
                        <i className="fa fa-file-text fa-2x fa-fw"/>
                        <div> Resume </div>
                    </a>
                </li>
                <li>                            
                    <a href="https://github.com/erickhouse1">
                        <i className="fa fa-file-text-o fa-2x fa-fw"/>
                        <div> CV </div>
                    </a>
                </li>
                </div>
            </ul>
            </div>
                <div className="TabNav"> 
                    <div className="container">                      
                        <nav className="my-2">
                            {routes.map((route, i) => {
                                return(
                                    <a href="#" className="m-2 ml-0">
                                        <Link className="text-white" to={route.path} key={i}> {route.displayText} </Link>
                                    </a>
                                );
                            })}
                        </nav> 
                    </div>                     
                </div>
               </div>
    }

  render() {
    return (
        <div>
            {this.renderNavBar()}
            <div className="container">
            <div className="columns">
                <div className="three-fourths column">
                    {this.state.posts.map((post, i) => {
                        return(
                            <PostHeading data={post} key={i}/>
                        );
                    })}
                </div>
                <div className="one-fourth column">
                        <div className="border-bottom">
                            <h3> About </h3>
                        </div>
                        <div className="border-bottom">
                            <h3> Contact </h3>
                        </div>
                </div>
            </div>
            </div>
        </div>
    );
  }
}



export default Home;