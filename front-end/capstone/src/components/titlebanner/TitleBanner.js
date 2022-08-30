import React, {useState} from "react";
import Search from "./Search";
import Favourites from "./Favourites";
import AuthNav from "../AuthComponents/AuthNav";
import styled from "styled-components"
import {
    PayPalScriptProvider,
    PayPalButtons,
    usePayPalScriptReducer
} from "@paypal/react-paypal-js";
import PayPalButton from "./PayPal"

const TitleBanner = () => {
    const [showModal, setShowModal] = useState(false);
    return(
        <SecondNav>
            <Search />
            {/* <Favourites /> */}
            <AuthNav/>
            <FAIconHeart><i className="fa fa-heart fa-2x"></i></FAIconHeart>
            <FAIconPaypal><i className="fa fa-cc-paypal fa-2x" onClick={() => setShowModal(true)}></i></FAIconPaypal>
            {showModal ? (
                <>
                <div className="flex justify-center items-center overflow-x-hidden overflow-y-auto fixed inset-0 z-50 outline-none focus:outline-none">
                    <div className="relative w-auto my-6 mx-auto max-w-none">
                    <Modal className="border-0 rounded-lg shadow-lg relative flex flex-col w-full bg-white outline-none focus:outline-none">
                        <div className="flex items-start justify-between p-5 border-b border-solid border-gray-500 rounded-t ">
                        <h3 className="text-3xl font=semibold">Support Us!</h3>
                        <button
                            className="bg-transparent border-0 text-black float-right"
                            onClick={() => setShowModal(false)}>
                            <i className="fa fa-circle-xmark fa-2x"></i>
                        </button>
                        {/* <PayPalButton></PayPalButton> */}
                        </div>
                    </Modal>
                    </div>
                </div>
                </>
            ) : null}
        </SecondNav>
    )

}

const SecondNav = styled.div`
padding: 1rem 2rem;
display:flex;
justify-content:flex-end;
flex-wrap: wrap;
background-color: #3c4550;
position: relative;
`

const FAIconPaypal = styled.button`
background: transparent;
border: none;
color: #FFCC00;
padding-inline:1rem;
`

const FAIconHeart = styled.button`
background: transparent;
border: none;
color: red ;
padding-inline:1rem;
`

const Modal = styled.div`
display:flex;
flex-direction:column;
`

export default TitleBanner;