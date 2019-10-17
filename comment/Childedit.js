import React, { Component } from 'react';

class ChildComponent extends Component {
    

render() {
    return (
        <div>
            <h3>Comment : {this.props.myDataProp}</h3>
            <button onClick={this.props.updateStateProp}>Edit</button>
            
        </div>
    );
}
}
export default ChildComponent;