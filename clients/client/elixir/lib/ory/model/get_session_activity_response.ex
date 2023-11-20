# NOTE: This file is auto generated by OpenAPI Generator 6.6.0 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule Ory.Model.GetSessionActivityResponse do
  @moduledoc """
  Response of the getSessionActivity endpoint
  """

  @derive [Poison.Encoder]
  defstruct [
    :data
  ]

  @type t :: %__MODULE__{
    :data => [Ory.Model.SessionActivityDatapoint.t]
  }
end

defimpl Poison.Decoder, for: Ory.Model.GetSessionActivityResponse do
  import Ory.Deserializer
  def decode(value, options) do
    value
    |> deserialize(:data, :list, Ory.Model.SessionActivityDatapoint, options)
  end
end
