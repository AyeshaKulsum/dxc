import React, { Component } from 'react';
import { isPending } from 'q';
import ProductDisplay from './ProductDisplay';

class ProductList extends Component {
    productList=[
        {
            productId:1001,
            productName:"pen",
            quantityOnHand:22,
            price:2300
        },
        {
            productId:1002,
            productName:"laptop",
            quantityOnHand:344,
            price:4455
        }
    ]
    render() {
        return (
            <div>
                {this.productList.map((product ,index)=>
                    <ProductDisplay nn={index} key={index} product ={product}></ProductDisplay>
                   
                    )}
            </div>
        );
    }
}

export default ProductList;