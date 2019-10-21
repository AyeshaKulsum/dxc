import React, { Component } from 'react';

class ProductDisplay extends Component {
    render() {
        //destructre next line is
        const {nn,product}=this.props
        return (
            <div>
                <h3>
                    Key : {nn}
                    ProductId : {this.props.product.productId}{' '}{' '}
                        Product Name : {this.props.product.productName}{' '}
                        Quantity on hand : {this.props.product.quantityOnHand}{' '}
                        Price : {this.props.product.price}{' '}
                    </h3>
                {/* </div>    <a onClick=[() => {document.location.href="LoginVali"}]>Go</a> */}
            </div>
        );
    }
}

export default ProductDisplay;