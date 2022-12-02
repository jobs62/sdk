/*
 * Ory APIs
 *
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v1.0.1
 * Contact: support@ory.sh
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using Xunit;

using System;
using System.Linq;
using System.IO;
using System.Collections.Generic;
using Ory.Client.Api;
using Ory.Client.Model;
using Ory.Client.Client;
using System.Reflection;
using Newtonsoft.Json;

namespace Ory.Client.Test.Model
{
    /// <summary>
    ///  Class for testing ClientSourcePosition
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by OpenAPI Generator (https://openapi-generator.tech).
    /// Please update the test case below to test the model.
    /// </remarks>
    public class ClientSourcePositionTests : IDisposable
    {
        // TODO uncomment below to declare an instance variable for ClientSourcePosition
        //private ClientSourcePosition instance;

        public ClientSourcePositionTests()
        {
            // TODO uncomment below to create an instance of ClientSourcePosition
            //instance = new ClientSourcePosition();
        }

        public void Dispose()
        {
            // Cleanup when everything is done.
        }

        /// <summary>
        /// Test an instance of ClientSourcePosition
        /// </summary>
        [Fact]
        public void ClientSourcePositionInstanceTest()
        {
            // TODO uncomment below to test "IsType" ClientSourcePosition
            //Assert.IsType<ClientSourcePosition>(instance);
        }


        /// <summary>
        /// Test the property 'Line'
        /// </summary>
        [Fact]
        public void LineTest()
        {
            // TODO unit test for the property 'Line'
        }
        /// <summary>
        /// Test the property 'Column'
        /// </summary>
        [Fact]
        public void ColumnTest()
        {
            // TODO unit test for the property 'Column'
        }

    }

}