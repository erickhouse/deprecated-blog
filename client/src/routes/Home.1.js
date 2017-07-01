/*@flow*/
import React, { Component } from 'react';
//import Header from "../components/Header";
import { Navbar, NavItem, Nav, Grid, Row, Col, Panel, PanelGroup, MenuItem, NavDropdown, ListGroup, ListGroupItem} from 'react-bootstrap';

import Post from "../components/Post";

import Divider from 'material-ui/Divider';

import routes from '../routes/Routes'


import {Link} from 'react-router-dom';

import "../styles/Home.css"



import App from "../App";

import { Media} from 'react-bootstrap';



class Home extends Component {

    constructor(props) {
        super(props);

        this.state = {
            data: []
        };
    }

    componentDidMount(){
        // fetch('/count').then(
        //     function (response) {
        //         return response.text();
        //     }
        // ).then((data) => {
        //     console.log(data);
        //     const test = data;
        //     this.setState({data:test});
        // });
    }
    componentWillMount(){
        this.setState({cool:"cool"});
    }


    renderNavBar(){
        return <div>

            <Navbar inverse staticTop style={{
                verticalAlign:"middle",
                marginBottom:0,
                fontSize: 25,
                background:"black"}}>
                <Nav>
                    <NavItem>
                        <h2> Erick House </h2>
                    </NavItem>
                </Nav>
            </Navbar>
            <Navbar staticTop style={{marginTop:0, fontSize: 22}}>
                <Nav>
                    {routes.map((route, i) => {
                        return(
                            <NavItem href="#" >
                                <Link to={route.path} key={i}> {route.displayText} </Link>
                            </NavItem>
                        );
                    })}
                </Nav>
                <Nav>
                                <div className="tabnav">
            <a className="btn btn-sm float-right" href="#url" role="button">Button</a>
            <nav className="tabnav-tabs" aria-label="Foo bar">
                <a href="#url" className="tabnav-tab selected" aria-current="page">Foo Tab</a>
                <a href="#url" className="tabnav-tab">Bar Tab</a>
            </nav>
            </div>
                </Nav>
                <Nav pullRight>
                    <NavItem>
                        <a href="https://github.com/erickhouse1">
                            <i className="fa fa-github ">
                                <span style={{fontFamily:"Helvetica", fontSize: 15}}> Github</span>
                            </i>
                        </a>
                    </NavItem>
                    <NavItem>
                        <a href="https://github.com/erickhouse1">
                            <i className="fa fa-linkedin-square ">
                                <span style={{fontFamily:"Helvetica", fontSize: 15}}> LinkedIn</span>
                            </i>
                        </a>
                    </NavItem>
                    <NavItem>
                        <a href="https://github.com/erickhouse1">
                            <i className="fa fa-file-text">
                                <span style={{fontFamily:"Helvetica", fontSize: 15}}> Resume</span>
                            </i>
                        </a>
                    </NavItem>
                    <NavItem>
                        <a href="https://github.com/erickhouse1">
                            <i className="fa fa-file-text-o">
                                <span style={{fontFamily:"Helvetica", fontSize: 15}}> CV</span>
                            </i>
                        </a>
                    </NavItem>
                </Nav>
            </Navbar>
        </div>
    }

  render() {

        var data = "cool";
        if(this.state.data)
            data = this.state.data;

    return (
        <div>
            {this.renderNavBar()}
            <Grid >
                <Row>
                    <Col xs={12} md={9} lg={9}>
                        <div style={{textAlign:"left", marginLeft:"20pt"}}>
                            <h3>Recent Posts</h3>
                            <Divider/>
                        </div>
                        <div style={{textAlign:"left", marginLeft:"30pt"}}>
                            <Post data={{
                                tags: ["JavaScript","React","Scala"],
                                title : "test titile",
                                heading : {
                                    media: "Cool Pic"
                                },
                                body : {
                                    content : "test body"
                                }
                            }}/>
                        </div>
                    </Col>
                    <Col xs={6} md={3} lg={3}>
                        <div>
                            <ListGroup style={{borderStyle:"none"}}>
                                <ListGroupItem style={{borderStyle:"none"}}>Item 1</ListGroupItem>
                                <ListGroupItem>Item 2</ListGroupItem>
                                <ListGroupItem>...</ListGroupItem>
                            </ListGroup>
                        </div>
                    </Col>
                </Row>
            </Grid>
        </div>
    );
  }
}



export default Home;