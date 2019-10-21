import React, { Component } from 'react';

class ChildComponent extends Component {
    

render() {
    return (
        <div>
            <button onClick={this.props.updateStateProp}>Click</button>
            <h3>The value of myDataProp : {this.props.myDataProp}</h3>
        </div>
    );
}
}
export default ChildComponent;