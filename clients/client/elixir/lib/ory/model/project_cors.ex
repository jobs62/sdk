# NOTE: This file is auto generated by OpenAPI Generator 6.6.0 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule Ory.Model.ProjectCors do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :enabled,
    :origins
  ]

  @type t :: %__MODULE__{
    :enabled => boolean() | nil,
    :origins => [String.t] | nil
  }
end

defimpl Poison.Decoder, for: Ory.Model.ProjectCors do
  def decode(value, _options) do
    value
  end
end
