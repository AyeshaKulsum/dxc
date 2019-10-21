import React, { Component } from 'react';

class Destructuring extends Component {
    render() {
        const{uname}=this.props
        return (
            <div>
                <h1>your name is:{uname}</h1>
            </div>
        );
    }
}

export default Destructuring;